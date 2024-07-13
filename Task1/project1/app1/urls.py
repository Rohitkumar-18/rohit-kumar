from django . urls import path
from . import views
urlpatterns=[
    path('display_Batch/',views.display_Batch,name='display_Batch'),
    path('display_Paper/',views.display_Paper,name='display_Paper'),
    path('display_Student/',views.display_Student,name='display_Student'),
    path('display_StudentTrans/',views.display_StudentTrans,name='display_StudentTrans'),
    path('display_Course/',views.display_Course,name='display_Course'),
    path('display_Exam/',views.display_Exam,name='display_Exam'),
    path('display_Sem/',views.display_Sem,name='display_Sem'),
  
    
    path('process_batch_entry/',views.process_batch_entry,name='process_batch_entry'),
    path('insert_view/',views.insert_view,name='insert_view'),
    path('displayBatchInput/',views.displayBatchInput,name='displayBatchInput'),
    path('delete/<pk>/',views.delete,name='delete'),
    path('delete_batch/',views.delete_batch,name='delete_batch'),
    
    path('display_image/',views.display_image,name='display_image'),
    path('process_course_entry/',views.process_course_entry,name='process_course_entry'),
    path('displayCourseInput/',views.displayCourseInput,name='displayCourseInput'),
    path('insert_courseview/',views.insert_courseview,name='insert_courseview'),
   
    
    path('process_Paper_entry/',views.process_Paper_entry,name='process_Paper_entry'),
    path('displayPaperInput/',views.displayPaperInput,name='displayPaperInput'),
    path('insert_paperview/',views.insert_paperview,name='insert_paperview'),
   
    
    path('process_Sem_entry/',views.process_Sem_entry,name='process_Sem_entry'),
    path('displaySemInput/',views.displaySemInput,name='displaySemInput'),
    path('insert_semview/',views.insert_semview,name='insert_semview'),
   
    
    path('process_Exam_entry/',views.process_Exam_entry,name='process_Exam_entry'),
    path('displayExamInput/',views.displayExamInput,name='displayExamInput'),
    path('insert_examview/',views.insert_examview,name='insert_examview'),
    
       
    path('insert5_view/',views.insert5_view,name='insert5_view'),
    path('displayStudentInput/',views.displayStudentInput,name='displayStudentInput'),
    path('process_student_entry/',views.process_student_entry,name='process_student_entry'),
    path('display_student/',views.display_student,name='display_student'),
    

     
    path('insert6_view/',views.insert6_view,name='insert6_view'),
    path('displayStudentInternalTransInput/',views.displayStudentInternalTransInput,name='displayStudentInternalTransInput'),
    path('process_studentinternaltrans_entry/',views.process_studentinternaltrans_entry,name='process_studentinternaltrans_entry'),
    path('display_studentinternaltrans/',views.display_studentinternaltrans,name='display_studentinternaltrans'),
    path('delete/<pk>/',views.delete,name='delete'),
]
   

    
    
    
    
    
