from django.urls import path
from.import views
urlpatterns=[
    path('balaji/', views.balaji,name='balaji'),
    path('nagendra/',views.nagendra,name='nagendra'),
    path('rohit/', views.rohit,name='rohit'),
    path('ram/', views.ram,name='ram'),
    path('mohan/',views.mohan,name='mohan'),
    path('anu/',views.anu,name='anu'),
    path('devi/',views.devi,name='devi'),
    ]

