from django.shortcuts import render
from django .http import HttpResponse
from django .template import loader
# Create your views here.
def display_master(request):
    return render(request,'master.html')
def display_program1(request):
    return render(request,'program1.html')
def insert_view(request):
    return render(request,'insert_view.html')
