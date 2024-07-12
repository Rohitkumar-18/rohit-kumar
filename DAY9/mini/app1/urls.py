from django.urls import path
from .import views
urlpatterns=[
   path('insert_view/',views.insert_view,name='insert_view'),
   path('display_exam/',views.display_exam,name='display_exam'),
   path('process_exam_entry/',views.process_exam_entry,name='process_exam_entry'),
   path('displayExamInput/', views.displayExamInput, name='displayExamInput'),
   path('add_data/',views.add_data,name='add_data'),
   path('home_view/',views.home_view,name='home_view'),
   path('homes_view/',views.homes_view,name='homes_view'),
]
   

    


    


