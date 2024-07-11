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
  path('insert_view/',views.insert_view,name='insert_view'),
  path('display_student/',views.display_student,name='display_student'),
  path('display_course/',views.display_course,name='display_course'),
  path('display_enroll/',views.display_enroll,name='display_enroll'),
  path('insert_studentview/',views.insert_studentview,name='insert_studentview'),
  path('process_student_entry/',views.process_student_entry,name='process_student_entry'),
  path('displayStudentInput/',views.displayStudentInput,name='displayStudentInput'),
  path('process_course_entry/',views.process_course_entry,name='process_course_entry'),
  path('displayCourseInput/',views.displayCourseInput,name='displayCourseInput'),
  path('process_enroll_entry/',views.process_enroll_entry,name='process_enroll_entry'),
  path('displayEnrollInput/',views.displayEnrollInput,name='displayEnrollInput'),
  ]
                      

