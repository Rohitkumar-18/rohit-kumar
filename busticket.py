print('welcome to MyBus..')
dest=input('''
select destination by entering
           1 for delhi
           2 for mumbai
           3 for chennai
           4 for kolkatha
 :-''')
adult_seats=int(input('Number of adults :-')) 
child_seats=int(input('Number of childs :-'))  
category   =input('enter \n 1for AC \n 2 for Non AC \n:-')   
distance  ={'1':2000,'2':800,'3':350,'4':500}
if category=='1':
    adult_price=10
    child_price=5
elif category =='2':
    adult_price=5
    child_price=3
total_price=distance[dest]*(adult_price*adult_seats+child_price*child_seats)
print('the total amount is:-',total_price,'rupees')
confirm=input ('enter "yes" for confirm or press any other key to cancel:-')
if confirm=='yes':
    print('your transaction successfull')
    print('thank you ...\n visit again ... \n Happy Journey...')
else:
    print('your transaction cancelled')
    print('thank you ..visit again...')               
