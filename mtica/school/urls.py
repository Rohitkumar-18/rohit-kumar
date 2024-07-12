from django.urls import path
from .import views
urlpatterns=[
    path('display/', views.displayindex,name='displayindex'),
    ]
            
