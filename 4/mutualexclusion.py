import threading
import time

class CricticalSection():
    def __init__(self):
        self.sem = threading.Semaphore()  #initializing semaphore using Semaphore class in threading module

    def process_1(self):
        while True:
            print("Entry Section 1")
            self.sem.acquire()      #decrement the value of semahpore

            self.criticalsection()  #entering crictical section(process 1)
            self.sem.release()      #incrementing the value of semaphore hence allowing  other thread to enter critical section


            print("Critical Section over for process 1") #remainder section of the  process 1
 
            time.sleep(3)           #allowing some delay in the process 

    def process_2(self):
        while True:
            print("Entry Section-2")
            self.sem.acquire()      #decrement the value of semahpore

            self.criticalsection()  #entering crictical section (process 2)
            self.sem.release()      #incrementing the value of semaphore hence allowing other thread to enter critical section
 

            print("Critical Section over for process 2")    #remainder section of the process 2

            time.sleep(3)    #allowing some delay in the process 

    def criticalsection(self):
        print(" Entered Critical Section!. Perform operation on shared resource")

    def main(self):
        t1 = threading.Thread(target = self.process_1) #calling process 1
        t1.start()
        t2 = threading.Thread(target = self.process_2) #calling  process 2
        t2.start()

if __name__=="__main__":
    c = CricticalSection()
    c.main()