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
    path('delete_Batch/',views.delete_Batch,name='delete_Batch'),
    path('search/', views.search_view, name='search'),
   

    
    path('display_image/',views.display_image,name='display_image'),
    path('process_course_entry/',views.process_course_entry,name='process_course_entry'),
    path('displayCourseInput/',views.displayCourseInput,name='displayCourseInput'),
    path('insert_courseview/',views.insert_courseview,name='insert_courseview'),
    path('delete1/<pk>/',views.delete1,name='delete1'),
    path('delete_Course/',views.delete_Course,name='delete_Course'),
    path('search2/', views.search_Courseview, name='search2'),
    
    
    path('process_Paper_entry/',views.process_Paper_entry,name='process_Paper_entry'),
    path('displayPaperInput/',views.displayPaperInput,name='displayPaperInput'),
    path('insert_paperview/',views.insert_paperview,name='insert_paperview'),
    path('delete2/<pk>/',views.delete2,name='delete2'),
    path('delete_Paper/',views.delete_Paper,name='delete_Paper'),
    
    
    path('process_Sem_entry/',views.process_Sem_entry,name='process_Sem_entry'),
    path('displaySemInput/',views.displaySemInput,name='displaySemInput'),
    path('insert_semview/',views.insert_semview,name='insert_semview'),
    path('delete3/<pk>/',views.delete3,name='delete3'),
    path('delete_Sem/',views.delete_Sem,name='delete_Sem'),
    
    
    path('process_Exam_entry/',views.process_Exam_entry,name='process_Exam_entry'),
    path('displayExamInput/',views.displayExamInput,name='displayExamInput'),
    path('insert_examview/',views.insert_examview,name='insert_examview'),
    path('delete4/<pk>/',views.delete4,name='delete4'),
    path('delete_Exam/',views.delete_Exam,name='delete_Exam'),


    path('edit_batch/int:pk/', views.edit_batch, name='edit_batch'),
    path('batch_detail/int:pk/', views.batch_detail, name='batch_detail'),
    path('batchmaster_details/',views.batchmaster_details ,name='batchmaster_details'),
    
]
