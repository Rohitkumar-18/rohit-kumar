import time
def duration(func):
    def inner():
        start=time.time()
        func()
        end=time.time()
        print(f'the total time taken to answer the question is {end-start} secs')
    return inner

@duration
def question1():
    print('who is the principal of MCA in MTCA')
    response=input('enter your response :-') 
@duration
def question2():
    print('which player has highest fan base in india')
    response=input('enter your response :-') 
question1() 
question2()            