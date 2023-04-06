class Node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None

class BinarySearchTree:
    def __init__(self):
        self.root=None
    def insert(self,data):
        newNode=Node(data)
        if self.root==None:
            self.root=newNode
        else:
            c = self.root
            while True:
                if data<c.data:
                    if c.left == None:
                        c.left = newNode
                        return
                    else:
                        c = c.left
                else:
                    if c.right == None:
                        c.right = newNode
                        return
                    else:
                        c = c.right
                
    def inorder(self,c):
        if c==None:
            return
        self.inorder(c.left)
        print(c.data)
        self.inorder(c.right)

    def revInorder(self,c):
        if c==None:
            return
        self.revInorder(c.right)
        print(c.data)
        self.revInorder(c.left)

    def pre(self,c):
        if c==None:
            return
        print(c.data)
        self.pre(c.left)
        self.pre(c.right)

    def post(self,c):
        if c==None:
            return
        self.post(c.left)
        self.post(c.right)
        print(c.data)

    def max(self):
        if self.root is None:
            return None
        
        while self.root.right is not None:
            self.root = self.root.right
            
        return self.root.data
    
    def search(self, key):
        c = self.root
        while c is not None:
            if c.data == key:
                return str(key)+" found"
            elif c.data < key:
                c = c.right
            else:
                c = c.left
        return str(key)+" not found"



BST = BinarySearchTree()
BST.insert(5)
BST.insert(4)
BST.insert(6)
BST.insert(8)
BST.insert(2)
BST.insert(7)
BST.insert(9)
BST.insert(3)
print("Ascending")
BST.inorder(BST.root)
print("Descending")
BST.revInorder(BST.root)
print("MAX")
print(BST.max())
print("search")
print(BST.search(10))
# print("pre-order")
# BST.pre(BST.root)
# print("post-order")
# BST.post(BST.root)