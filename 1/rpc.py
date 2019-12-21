import rpyc
conn = rpyc.classic.connect("localhost")
try:
    
    conn.execute('''s=input("Please Enter Your NAme ")''')
    conn.execute('''print("Hello  "+s)''')
   
except:
    print("Something Is Wrong")