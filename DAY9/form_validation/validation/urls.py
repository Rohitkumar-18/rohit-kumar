from django.contrib import admin
from django.urls import path
from .import views

urlpatterns=[
   path('admin/', admin.site.urls),
   path('home_view/',views.home_view, name='home_view'),
]
