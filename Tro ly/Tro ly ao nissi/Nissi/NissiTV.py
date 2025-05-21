import datetime
import speech_recognition as sr #pip install speechRecognition
from gtts import gTTS #pip install gTTS
import playsound   #pip install playsound==1.2.2
import os
import webbrowser as wb

def noi(text):
    print("Nissi:", text)
    tts = gTTS(text=text, lang='vi')
    tts.save("temp.mp3")
    playsound.playsound("temp.mp3")
    os.remove("temp.mp3")

def gio():
        # thoiGian = datetime.datetime.now().strftime("%H:%M")
        # noi("Bây giờ là " + thoiGian + " phút ")
        now = datetime.datetime.now()
        gio = now.hour
        phut = now.minute
        noi(f"Bây giờ là {gio} giờ {phut} phút")
        

def ngay():
    days_vi = {
        "Monday": "Thứ hai",
        "Tuesday": "Thứ ba",
        "Wednesday": "Thứ tư",
        "Thursday": "Thứ năm",
        "Friday": "Thứ sáu",
        "Saturday": "Thứ bảy",
        "Sunday": "Chủ nhật"
    }

    now = datetime.datetime.now()
    day_eng = now.strftime("%A")
    thu = days_vi.get(day_eng, "Không xác định")
    ngay = now.day
    thang = now.month
    nam = now.year

    noi(f"Hôm nay là {thu}, ngày {ngay} tháng {thang} năm {nam}")

def chaoMung():
    hour = datetime.datetime.now().hour
    if 6 <= hour < 12:
        noi("Chào buổi sáng, chúc bạn một buổi sáng an lành")
    elif 12 <= hour < 18:
        noi("Chào buổi chiều, chúc bạn một buổi chiều mát mẻ")
    elif 18 <= hour <= 23:
        noi("Chào buổi tối, chúc bạn một buổi tối vui vẻ")
    noi("Hãy nói một lời xin chào để bắt đầu nhé")
def camOn():
    noi("Bạn đừng ngại nhé, có gì cứ nói mình nhé")
def lenh():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        noi("Tôi đang lắng nghe bạn nói...")
        r.pause_threshold = 1.2
        audio = r.listen(source)
    try:
        query = r.recognize_google(audio, language='vi-VN')
        print("Người dùng:", query)
    except sr.UnknownValueError:
        print("Xin lỗi, tôi không hiểu. Bạn có thể gõ lệnh.")
        query = input("Lệnh của bạn: ")
    return query.lower()

def xuLy_query(query):
    if "google" in query:
        noi("Bạn muốn tìm gì trên Google?")
        timKiem = lenh()
        wb.get().open(f"https://www.google.com/search?q={timKiem }")
        noi(f"Kết quả tìm kiếm {timKiem } trên Google")
    elif "youtube" in query:
        noi("Bạn muốn tìm gì trên YouTube?")
        timKiem = lenh()
        wb.get().open(f"https://www.youtube.com/results?search_query={timKiem }")
        noi(f"Kết quả tìm kiếm {timKiem } trên YouTube")
    elif "facebook" in query:
        noi("Bạn muốn tìm gì trên Facebook?")
        timKiem  = lenh()
        wb.get().open(f"https://www.facebook.com/search/top?q={timKiem }")
        noi(f"Kết quả tìm kiếm {timKiem } trên Facebook")
    elif "mấy giờ" in query or "giờ" in query:
        gio()
    elif "ngày" in query or "hôm nay" in query or "thứ" in query:
        ngay()
    elif "cảm ơn" in query or "thanks" in query or "thank you" in query:
        camOn()
    elif "thoát" in query or "tạm biệt" in query or "ra" in query or "bye" in query:
        noi("Nissi xin chào và tạm biệt bạn nhé. Hẹn gặp lại. Chúc bạn một ngày tốt lành.")
        quit()
    else:
        noi("Xin lỗi, tôi chưa hiểu lệnh này.")

if __name__ == "__main__":
    noi("Xin chào, tôi là trợ lý ảo Nissi")
    chaoMung()
    activated = False

    while True:
        query = lenh()
        if "xin chào" in query or "chào" in query or "hi" in query or "hello" in query and not activated:
            noi("Xin chào bạn, tôi có thể giúp gì cho bạn?")
            activated = True
        elif activated:
            xuLy_query(query)
        else:
            noi("Hãy nói 'xin chào' để bắt đầu.")
