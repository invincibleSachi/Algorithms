package com.inspire.datastrcutures;

/***
 * When a page is referenced, the required page may be in the memory. If it is in the memory, we need to detach the node of the list and bring it to the front of the queue.
 * If the required page is not in the memory, we bring that in memory. In simple words, we add a new node to the front of the queue and update the corresponding node address in the hash. If the queue is full, i.e. all the frames are full, we remove a node from the rear of queue, and add the new node to the front of queue.
 * @param <T>
 */
public class LruCacheImpl<T> {
    private Node front=null;
    private Node rear = null;
    private int size=0;
    private int max;

    public LruCacheImpl(int n){
        max=n;
    }

    public void referPage(T page){
        if (size==0){
            front=new Node(page);
            rear=front;
            size++;
        }else if (size<max){
            Node searchedNode=searchPage(page);
            if (searchedNode==null){
                Node newNode=new Node(page);
                newNode.setNext(front);
                newNode.setPreviousNode(null);
                front=newNode;
                size++;
            }else{
                Node next2SearchNode=searchedNode.getNextNode();
                Node prev2SearchNode=searchedNode.getPreviousNode();
                if(rear==searchedNode){
                    rear=prev2SearchNode;
                    rear.setNext(null);
                }
                searchedNode.setNext(front);

                searchedNode.setPreviousNode(null);
                front=searchedNode;
                if(prev2SearchNode!=null){
                    prev2SearchNode.setNext(next2SearchNode);
                }

            }

        }else if(size==max)  {
            Node searchedNode=searchPage(page);
            if (searchedNode==null){
                Node newNode=new Node(page);
                newNode.setNext(front);
                newNode.setPreviousNode(null);
                front=newNode;
                //remove rear node & do not increment size
                Node prev2RearNode=rear.getPreviousNode();
                prev2RearNode.setNext(null);
            }else{
                Node next2SearchNode=searchedNode.getNextNode();
                Node prev2SearchNode=searchedNode.getPreviousNode();
                searchedNode.setNext(front);
                searchedNode.setPreviousNode(null);
                front=searchedNode;
                prev2SearchNode.setNext(next2SearchNode);
            }
        }
    }

    public void displayCache(){
        Node tmp=front;
        while (tmp!=null){
            System.out.println(tmp.getData());
            tmp=tmp.getNextNode();
        }
    }

    public Node searchPage(T t){
        Node tmp=null;
        if(size==0){
            return null;
        }else{
            tmp=front.getNextNode();
        }
        while(tmp!=null){
            if(tmp.getData()==t){
                return tmp;
            }
            tmp=tmp.getNextNode();
        }
        return tmp;
    }

}
