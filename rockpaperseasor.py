print('enter /n 1--> rock \n2-->paper \n 3-->scissor')
p1=input('enter rock paper scissor')
p2=input('enter rock scissor paper')
if p1==p2:
      print('match tie') 
elif p1=='1'and p2=='3': 
      print('player 1 won') 
elif p1=='2'and p2=='1':
      print('player 1 won')  
elif p1=='3' and p2=='2':
      print('player 1 won')          
else:
      print( 'player 2 won')  