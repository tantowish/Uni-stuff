class Queue:
    def __init__(self):
        self.queue = []
        self.size=0

    def isEmpty(self):
        if len(self.queue) == 0:
            return True
        else:
            return False
        
    def display(self):
        for i in range(len(self.queue)):
            print(str(i+1)+".",self.queue[i])
        
    def push(self, data):
        self.queue.append(data)
        self.size+=1
        
    def pop(self):
        if self.isEmpty() == False:
            self.queue.pop(0)
        self.size-=1
        
    def front(self):
        return self.queue[0]

    def back(self):
        return self.queue[-1]
    
    # Mendapat total dari semua produk
    def total(self):
        total=0
        for i in range(self.size):
            numeric_string = ''.join(filter(str.isdigit, self.queue[i][1]))
            total+=int(numeric_string)
        return total
