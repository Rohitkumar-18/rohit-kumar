import time
def duration(func):
        def inner():
            start=time.time()
            func()
            end=time.time()
        print(f'the total time taken to answer the questioin is {end-start} secs')
        return inner
@duration
def qn1():
    print('who is the principal of MCA in MTCA')
    response=input('enter your response :-')
@duration
def question2():
      print('who is the all time greatest player in india')
      response=input('enter your response :-')
@duration
def question3():
      print('who is the prime minuster of  india')
      response=input('enter your response :-')
@duration
def question4():
      print('which team has the highest fan base in ipl')
      response=input('enter your response :-')
@duration
def question5():
      print('which ipl team has created more records')
      response=input('enter your response :-')
@duration
def question6():
      print('which is the popular temple in india')
      response=input('enter your response :-')
@duration
def question7():
      print('why virat kohli has highest fan base')
      response=input('enter your response :-')
qn1()
question2()
question3()
question4()
question5()
question6()
question7()








