
from tkinter import*
from tkinter.ttk import*
from time import strftime
hinhNen = Tk()
hinhNen.title ("Giờ Carrot Xinh Yêu ")
def gioGiac():
    chuoi = strftime('%H:%M:%S:%p') # muốn hiện giờ 1 đén 24 ('%H:%M:%S:%p')
    gio_24.config(text=chuoi)
    gio_24.after(1000, gioGiac)
gio_24 =Label(hinhNen, font =("Digital-7",100), background= 'pink', foreground= 'white')
gio_24.pack(expand=True)
#---------------------------------------------------------------------------------------
def thoiGian():
    chuoi = strftime('%I:%M:%S:%p') # muốn hiện giờ 1 đén 12 ('%I:%M:%S:%p')
    gio_12.config(text=chuoi)
    gio_12.after(1000, thoiGian)
gio_12 =Label(hinhNen, font =("Digital-7",100), background= 'red', foreground= 'white')
gio_12.pack(expand=True)
#----------------------------------------------------------------------------------------
gioGiac()
thoiGian()
hinhNen.mainloop()
