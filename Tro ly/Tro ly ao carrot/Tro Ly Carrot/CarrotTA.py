import pyttsx3                   #pip install pyttsx3   
import datetime
import speech_recognition as sr  #pip install speechRecognition 
import webbrowser as wb
import pyaudio                   #pip install pyaudio
carrot = pyttsx3.init()
voice = carrot.getProperty('voices')
carrot.setProperty('voice', voice[1].id)  

def speak(audio):
    print("Carrot: " + audio)
    carrot.say(audio)
    carrot.runAndWait()

def tell_time():
    current_time = datetime.datetime.now().strftime("%I:%M %p")
    speak("The time is " + current_time)
def tell_date():
    current_date = datetime.datetime.now().strftime("%A, %d %B %Y")
    speak("Today is " + current_date)
def welcome():
    hour = datetime.datetime.now().hour
    if 6 <= hour < 12:
        speak("Good Morning")
    elif 12 <= hour < 18:
        speak("Good Afternoon")
    elif 18 <= hour <= 23:
        speak("Good Night")
    speak("Say hello to start")
def tell_thank():
    speak("No problem. How can I help you?")

def command():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        speak("I'm listening...")
        r.pause_threshold = 1.2
        audio = r.listen(source)
    try:
        query = r.recognize_google(audio, language='en')
        print("User: " + query)
    except sr.UnknownValueError:
        print("Sorry, I didn't understand. Please type your command.")
        query = input("Your order: ")
    return query.lower()

def handle_query(query):
    if "google" in query:
        speak("What should I search on Google?")
        search = command()
        wb.get().open(f"https://www.google.com/search?q={search}")
        speak(f"Here is your search for {search} on Google")

    elif "youtube" in query:
        speak("What should I search on YouTube?")
        search = command()
        wb.get().open(f"https://www.youtube.com/results?search_query={search}")
        speak(f"Here is your search for {search} on YouTube")

    elif "facebook" in query:
        speak("What should I search on Facebook?")
        search = command()
        wb.get().open(f"https://www.facebook.com/search/top?q={search}")
        speak(f"Here is your search for {search} on Facebook")
    elif "thank you" in query or "thanks" in query or "thank" in query:
        tell_thank()

    elif "time" in query:
        tell_time()

    elif "date" in query or "today" in query :
        tell_date()

    elif "stop" in query or "deactivate" in query:
        speak("Okay, say hello again when you need me.")
        return False  
    
    elif "bye" in query or "quit" in query or "exit" in query:
        speak("Carrot is quitting. Goodbye boss.")
        quit()
        
    else:
        speak("Sorry, I don't understand that command.")

if __name__ == "__main__":
    speak("Hello Everyone")
    speak("My name is Carrot")
    welcome()
    activated = False
    while True:
        query = command()
        if "hello" in query and not activated:
            speak("Hello, how can I help you?")
            activated = True
           
        elif activated:
            handle_query(query)
        else:
            speak("Say 'hello' to start using me.")
