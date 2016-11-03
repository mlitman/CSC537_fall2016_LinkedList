package cs.cuw.com.csc537_fall2016_linkedlist;

import android.widget.Button;

/**
 * Created by awesomefat on 11/2/16.
 */

public class Node
{
    private int payload;
    private Node nextNode;
    private Button view;

    public Node(int payload, Button view)
    {
        this.payload = payload;
        this.view = view;
        this.view.setText("" + payload);
        this.nextNode = null;
    }

    public int getPayload()
    {
        return payload;
    }

    public void setPayload(int payload)
    {
        this.payload = payload;
    }

    public Node getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }

    public Button getView()
    {
        return view;
    }

    public void setView(Button view)
    {
        this.view = view;
    }
}
