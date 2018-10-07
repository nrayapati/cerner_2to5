# cerner_2^5_2018

# One of the many reasons why Python is such a popular language is because it is readable and expressive.
# It is often joked that Python is ‘executable pseudocode’. But when you can write code like this, it’s difficult to argue otherwise:

x = [True, True, False]
if any(x):
    print("At least one True")
if all(x):
    print("Not one False")
if any(x) and not all(x):
    print("At least one True and one False")