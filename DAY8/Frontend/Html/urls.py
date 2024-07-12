from django .urls import path
from .import views
urlpatterns=[
    path('display_master/',views.display_master,name='display_master'),
    path('insert_view/', views.insert_view,name='insert_view'),
    path('display_program1/',views.display_program1,name='display_program1'),
    ]
