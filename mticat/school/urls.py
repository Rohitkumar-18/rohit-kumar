from django.urls import path
from .import views
urlpatterns=[
    path('displayindex/', views.displayindex,name='displayindex'),
    path('displayDAY1/',views.displayDAY1,name='displayDAY1'),
        path('displayprogram1/',views.displayprogram1,name='displayprogram1'),
    path('displayprogram2/',views.displayprogram2,name='displayprogram2'),
     path('displayprogram3/',views.displayprogram3,name='displayprogram3'),
     path('displayprogram4/',views.displayprogram4,name='displayprogram4'),
     path('displayprogram5/',views.displayprogram5,name='displayprogram5'),
     path('displayprogram6/',views.displayprogram6,name='displayprogram6'),
    path('displayprogram7/',views.displayprogram7,name='displayprogram7'),
     path('displayprogram8/',views.displayprogram8,name='displayprogram8'),
     path('displayprogram9/',views.displayprogram9,name='displayprogram9'),
    ]

    
            
