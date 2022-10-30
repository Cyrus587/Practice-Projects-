def take_user_input():
    user_name = input("Enter your name :")
    print("Hello: ", user_name)


def two_numbers_sum():
    num1 = int(input("Enter the first number"))
    num2 = int(input("Enter the second number"))
    sum_ = num1 + num2
    print(str(num1) + "+", str(num2) + "=", sum_)


def for_in_range_loop():
    for i in range(1, 5):  # prints the numbers 1-4
        print(i, end="")
    print()
    for i in range(5):  # prints the numbers 0-5
        print(i, end="")


def reverse_loop():
    for i in range(5, 0, -1):
        print(i, end=" ")
        print()


def third_parameter():
    for i in range(10, -1, 2):
        print(i, end="")


def iterable_for_loop():
    var_ = "name"
    for i in var_:
        print(i)


def while_loop():
    for i in range(0, 100, 2):
        print(i)


def string_concatination():
    str1 = " you have"
    str2 = " something I need"
    str3 = str1 + str2
    len(str1)
    print(str3)


def length_of():
    text = " this is the best day"
    print(len(text))


def max():
    text_ = "here we go"
    print()


def string_is_present():
    strl = " this is not correct"
    if 'is' in strl:
        print(strl)


def string_not_present():
    strl = "string not present in"
    str2 = 'lower'
    new_str = strl.replace("string", 'string!')
    print(str2.upper())
    print(new_str)


def string_present_():
    strl = "here I am"
    if 'is' not in strl:
        print(strl)


def string_splice():
    text = " textbooks"
    var = text[:4]
    var2 = text[:]
    var3 = text[2:]
    var4 = text[:]
    var5 = text[2:4]
    var6 = text[-4:]
    var7 = text[1:-4]
    var8 = text[1:5:1]
    var9 = text[::2]
    var10 = text[::-1]

    print(var)
    print(var2)
    print(var3)
    print(var5)
    print(var6)
    print(var7)
    print(var8)
    print(var9)
    print(var10)


def sum_of_diagonal(a):
    sum = 0
    for i in range(len(a)):
        sum += a[i][i]
    print(sum)


a_2d = [[1, 4, 1], [1, 3, 1], [1, 1, 7]]  # 1 + 3 + 7


def edit_list():
    gadgets = ["thing one", "thing two ", "thing three", "thing four"]
    string_iteams = []
    number_iteams = []
    for i in gadgets:
        if isinstance(i, str):
            string_iteams.append(i)
        elif isinstance(i, int) or isinstance(i, float):
            number_iteams.append(i)
        print(string_iteams)
        print(number_iteams)
        gadgets.reverse()
        print(gadgets)
        sorted(gadgets, key=len)


def dictionary_():
    phonebook = {
        "John": 938477566,
        "Jack": 938377264,
        "Jill": 947662781
    }
    del phonebook["Jill"]
    phonebook.pop("John")
    phonebook["Jason"] = 90210333

    for name, number in phonebook.items():
        print(name, number)


def alternative_dictionary(combined=None):
    phonebook = {}
    phonebook["John"] = 9876543
    phonebook["Layla"] = 111111
    phonebook["Cyrus"] = 912346
    New_pb = list(phonebook.items())
    New_pb.sort()  # will sort the list in ascending order
    print(New_pb)
    New_pb.sort(reverse=True)  # sort in reverse order
    print(New_pb)
    Friends = {
        "Jake": 18,
        "susan": 21,
        "Jody": 23,
        "R": 19

    }
    combined_dict = {}
    for i in (phonebook, Friends): combined_dict.update(i)
    print(combined_dict)


def auto_generated_dictionary():
    d = dict()
    for x in range(0, 16):
        d[x] = x * x
        print(d)


def iterating_through_dict_using_for_loop():
    d = {
        "red": 1,
        "blue": 3,
        'Green': 5,
    }
    for color_key, value in d.items():
        print(color_key, 'corresponds to', d[color_key])


def sum_items_in_dictionary():
    d = {
        "red": 1,
        "blue": 3,
        'Green': 5,
    }
    print(sum(d.values()))


def multiple_dict():
    d = {
        "red": 1,
        "blue": 3,
        'Green': 5,
    }
    result = 1
    for x in d:
        result = result * d[x]
    print(result)


def check_prime():
    num = int(input("please enter a number: "))
    for x in range(2, num):
        if num % x == 0:
            print("prime, %d ", x)
    else:
        print("Not Prime %d", x)


def New_list(L=[]):
    print(L[0], L[len(L) - 1])


def Fibo(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return Fibo(n - 1) + Fibo(n - 2)
    n = int(input())
    print("Fibo series: ", end ='')
    for i in range(o, n):
        prin



Fibo(9)
New_list([1, 3, 7])
check_prime()
sum_items_in_dictionary()
iterating_through_dict_using_for_loop()
auto_generated_dictionary()
alternative_dictionary()
dictionary_()
edit_list()
sum_of_diagonal(a_2d)
string_splice()
string_present_()
string_not_present()
string_is_present()
length_of()
take_user_input()
two_numbers_sum()
for_in_range_loop()
reverse_loop()
third_parameter()
iterable_for_loop()
while_loop()
string_concatination()
