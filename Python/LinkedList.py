class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0
    
    def addHead(self,data):
        newNode = Node(data)
        if self.size==0:
            self.tail = newNode
            self.head=newNode
            self.size+=1
        else:
            newNode.next=self.head
            self.head=newNode
            self.size+=1

    def addTail(self,data):
        newNode = Node(data)
        if self.size==0:
            self.tail=newNode
            self.head=newNode
            self.size+=1
        else:
            self.tail.next = newNode
            self.tail=self.tail.next
            self.size+=1
    
    def addMid(self,data,index):
        newNode=Node(data)
        c = self.head
        for i in range(index-1):
            c=c.next
        newNode.next=c.next
        c.next=newNode
        self.size+=1

    def printList(self):
        c = self.head
        while c!=None:
            print(c.data)
            c=c.next
            

LL = LinkedList()
LL.addHead(5)
LL.addHead(4)
LL.addHead(3)
LL.addTail(6)
LL.addMid(10,2)
LL.printList()
# print(LL.size)