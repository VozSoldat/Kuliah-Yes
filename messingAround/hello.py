sudut1=int(input("Masukkan sudut 1: "))
sudut2=int(input("Masukkan sudut 2: "))
sudut3=int(input("Masukkan sudut 3: "))

total_sudut=sudut1+sudut2+sudut3
#print(total_sudut)

if total_sudut == 180:
    if sudut1 == 90 or sudut2 == 90 or sudut3 == 90:
        print("Segitiga siku-siku.")
    elif sudut1==sudut2 and sudut2==sudut3:
        print("Segitiga sama sisi.")
    elif sudut1==sudut2 or sudut2==sudut3:
        print("Segitiga sama kaki.")
    else:
        print("Segitiga sembarang.")
elif total_sudut != 180:
    print("Bukan segitiga.")