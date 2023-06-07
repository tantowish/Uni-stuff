class Stack:
    def __init__(self):
        self.stack = [] 
        self.size=0

    def push(self, data):
        self.stack.append(data) 
        self.size+=1

    def isEmpty(self):
        
        if len(self.stack) == 0: 
            return True
        else:
            return False  

    def pop(self):
        if self.isEmpty() == False:
            self.stack.pop()
        self.size-=1
        
    def top(self):
        return self.stack[-1]

    def display(self):
        for i in range(len(self.stack)):
            print(str(i+1)+".",self.stack[i])
    
    def displayRev(self):
        for i in range(len(self.stack)-1,-1,-1):
            print(str(len(self.stack)-i)+".",self.stack[i])