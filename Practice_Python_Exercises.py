from typing import List
import random


def second_list():
    a = [1, 2, 3, 4, 5, 67]
    new_list = []
    for i in a:
        # d   if i % 2 == 0:
        new_list.append(i)
    print(new_list)


def second_list_one_line():
    a = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    a = [element for element in a if element % 2 == 0]
    print(a)


second_list_one_line()


def Rock_Paper_siccors():
    user_one_answer = str(input("do yo want to choose rock, paper or scissors?"))
    user_two_answer = str(input("do you want to choose rock paper or scissor?"))
    if user_one_answer == 'rock' and user_two_answer == 'scissors':
        return 'rock wins'
    elif user_one_answer == 'paper' and user_two_answer == 'rock':
        print("paper wins")
    elif user_one_answer == 'scissors' and user_two_answer == 'paper':
        print("scissors win")
    elif user_one_answer == user_two_answer:
        print("Draw")


def random_choice():
    a = random.randint(1, 9)
    if a < 9:
        print(" number is less than or equal to nine")
    if a > 9:
        print(" the number is greater than or equal to 9")
    else:
        print("this number is 9")


def list_comprehension():



random_choice()
Rock_Paper_siccors()

# if user_two_answer == user_one_answer:
#      return "Draw"
# elif 'scissors' == user_two_answer:
#    if 'rock' == user_one_answer:
#       return "rock wins"
# elif 'paper' == user_two_answer:
#   if 'rock' == user_one_answer:
#      return 'paper wins'
# elif 'scissors' == user_two_answer:
#   if 'rock' == user_one_answer:
#      return 'rock wins'
# elif
