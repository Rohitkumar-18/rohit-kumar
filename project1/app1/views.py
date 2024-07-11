from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def balaji(request):
    temp='I am class representative for MCA B section'
    return HttpResponse(temp)
def nagendra(request):
    return HttpResponse('I am nagendra from MCA B')
def rohit(request):
    return HttpResponse('I am rohit from MCA B')
def ram(request):
    return HttpResponse('I am ram from MCA B')
def mohan(request):
    return HttpResponse('I ram mohan from MCA B')
def anu(request):
    return HttpResponse('I am anu from MCA B')
def devi(request):
    return HttpResponse('I am devi from MCA B')

                        

