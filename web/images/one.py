# # lst = [1,2,3]
# # t=("a","b","c" )
# # s = "python"
# # print(lst,t,s, sep="---")
# # f=open("text.txt","r")
# # print(f.read ())

# import sys
# company="Google "
# loc="USA"
# mail="contact"
# print(company,loc,mail,file=sys.stderr)

# a=input("Enter your name: ")
# print("Hello ",a)

# a,b=input("Enter the two numbers: ").split()
# print("a=",a   )
# print("b=",b   )

# a=list(input("List1"))
# b=list(input("List2"))
# for i in b:
#     a.append(i)
# print("Final lsit",a)

# age=25
# if(age<=12):
#     print("child:")
# elif age<=19:
#     print("teenager")
# else:
#     print("adult")

# marks=35
# res = "pass" if marks>=40 else "fail"
# print("Result:",{res})


# x=10
# if x&1 ==0:
#     print("even")
# else:
#     print("odd")

y=2000


if(y%4==0 and y%100 !=0) or (y%400==0):
    print("leap year")
else:
    print("not a leap year")