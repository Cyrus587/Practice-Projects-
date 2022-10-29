import math 
def addfunction(x,y):
        x = 3
        y = 4
        return ( x+ y)
print(addfunction(3,4))

def areaofrectangle(w,L):
    w = 7 
    L = 14
    return (w*L)
print(areaofrectangle(6,6))

def snookerball(nRow):
    nRow = int()
    return ((nRow *(nRow -1)//2)) 
print(snookerball(4))
    
def hypotenuse(x,y):
    return(math.hypot(x,y))
print(hypotenuse(3,4))
 
def volumeofaSphere(r):
      
     return(4 *(math.pi*(r**2))) 
"have to put * after math.function"
print(volumeofaSphere(4))  

def indexastring(s):
    s= " hurt"
    return s[3]
print(indexastring("CyrusBarkhurst"))

def indexwithassersion(s):
     assert (len(s)> 2)
     assert( type(s) == str)
     return s[3]
    

#print(indexwithassersion("he"))
print(indexwithassersion("cyrusbarkhurst"))
     
def indexsecondleter(s):
       assert (len(s)>1)
       return s[1]
print( indexsecondleter("car"))



#problems from homework two

def ifstatement(x,y,z):
    z= x+y
    if (z >3):
        return(z)
    else :
        return("this function does not work")
print(ifstatement(1,1,2))

"Write a Python program to find those numbers which are divisible by 7 and multiple of 5, between 1500 and 2700 (both included)."

def function(x,n):
    n =[]
    for x in range(1500, 2701):  #use a forloop with range to tell weither something isin range of something else  #all the number the program test must be in this range will come back to this ,ine if the below conditions do not work
        if (x%7==0) and (x%5==0): #if the remander IE the operation you do after module is zero that means something is a factor or a multiple of seven 
            n.append(str(x))
 #this is the end for the range part of the program. so if it is and multiple of seven and a factor of five then ypou append the variable to the empty list.then print the empty list 
print(function(150))
  
