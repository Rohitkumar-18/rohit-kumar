from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.
def displayindex(request):
    return HttpResponse('rohit')
def displayDAY1(request):
    return render(request,'DAY1.html')
def displayprogram1(request):
    return render(request,'program1.html')
def displayprogram2(request):
    return render(request,'program2.html')
def displayprogram3(request):
    return render(request,'program3.html')
def displayprogram4(request):
    return render(request,'program4.html')
def displayprogram5(request):
    return render(request,'program5.html')
def displayprogram6(request):
    return render(request,'program6.html')
def displayprogram7(request):
    return render(request,'program7.html')
def displayprogram8(request):
    return render(request,'program8.html')
def displayprogram9(request):
    return render(request,'program9.html')














