#To handle class based views,
#we need to use the as_view() in the urls.py file.


from django.urls import path  
from . import views  
   
urlpatterns = [  
##    path('about/', views.NewView.as_view()),
    path('InsertEmployee1c/', views.EmployeeCreate.as_view(), name = 'EmployeeCreate'),
##      path('saveEmployee/', views.saveEmployee, name = 'saveEmployee'),
##    path('InsertEmployee1f/', views.view_employee_insert, name = 'view_employee_insert'),
##    path('processEmployee1f/', views.processEmployeeInsert, name = 'processEmployeeInsert'),
]  
