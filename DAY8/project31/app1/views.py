from django.shortcuts import render,redirect
from django.http import HttpResponse
from .forms import BookForm
from .models import Book
# Create your views here.
def index(request):
    books = Book.objects.all()
    context = {
        'books' : books
        }
    return render(request, 'index.html', context)
def upload_image(request):
    if request.method == 'POST':
       form = BookForm(request.POST, request.FILES)
       if form.is_valid():
        return redirect(index)
    else:
        form = BookForm()
        context = {
            'form' : form
            }
        return render(request,'upload_image.html', context)
        
    
