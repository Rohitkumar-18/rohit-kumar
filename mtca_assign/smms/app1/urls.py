from django.urls import path
from .import views


# Create your views here.
urlpatterns=[

    path('insert_view/',views.insert_view,name='insert_view'),
    path('displayBatchInput/',views.displayBatchInput,name='displayBatchInput'),
    path('process_batch_entry/',views.process_batch_entry,name='process_batch_entry'),
    path('display_batch/',views.display_batch,name='display_batch'),
    path('display_image/',views.display_image,name='display_image'),
    path('insert1_view/',views.insert1_view,name='insert1_view'),
    path('displayCourseInput/',views.displayCourseInput,name='displayCourseInput'),
    path('process_course_entry/',views.process_course_entry,name='process_course_entry'),
    path('display_course/',views.display_course,name='display_course'),
    path('display_image/',views.display_image,name='display_image'),
    path('insert2_view/',views.insert2_view,name='insert2_view'),
    path('displayExamInput/',views.displayExamInput,name='displayExamInput'),
    path('process_exam_entry/',views.process_exam_entry,name='process_exam_entry'),
    path('display_exam/',views.display_exam,name='display_exam'),
    path('display_image/',views.display_image,name='display_image'),
    path('insert3_view/',views.insert3_view,name='insert3_view'),
    path('displayPaperInput/',views.displayPaperInput,name='displayPaperInput'),
    path('process_paper_entry/',views.process_paper_entry,name='process_paper_entry'),
    path('display_paper/',views.display_paper,name='display_paper'),
    path('display_image/',views.display_image,name='display_image'),
    path('insert4_view/',views.insert4_view,name='insert4_view'),
    path('displaySemInput/',views.displaySemInput,name='displaySemInput'),
    path('process_sem_entry/',views.process_sem_entry,name='process_sem_entry'),
    path('display_sem/',views.display_sem,name='display_sem'),
    path('insert5_view/',views.insert5_view,name='insert5_view'),
    path('displayStudentInput/',views.displayStudentInput,name='displayStudentInput'),
    path('process_student_entry/',views.process_student_entry,name='process_student_entry'),
    path('display_student/',views.display_student,name='display_student'),
]

