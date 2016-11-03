package cs.cuw.com.csc537_fall2016_linkedlist;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by awesomefat on 11/2/16.
 */

public class LList
{
    private Node head;
    private int count;

    public LList()
    {
        this.head = null;
        this.count = 0;
    }

    public void addFront(int payload, LinearLayout view, Context context)
    {
        Node n = new Node(payload, new Button(context));
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            n.setNextNode(this.head);
            this.head = n;
        }
        this.count++;
        view.addView(n.getView(), 0);
    }

    public void addEnd(int payload, LinearLayout view, Context context)
    {
        Node n = new Node(payload, new Button(context));
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
           //find the last node
            Node currNode = this.head;
            while(currNode.getNextNode() != null)
            {
                currNode = currNode.getNextNode();
            }
            currNode.setNextNode(n);
        }
        this.count++;
        view.addView(n.getView());
    }
}
