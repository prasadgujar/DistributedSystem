#include <bits/stdc++.h>
using namespace std;

int main() {
    // your code goes here
    int m; // no of commands
    int n; // no of process
    int r; // no of resources
    int c; //co-ordinator process
    int req; // no request for resource
    int rid; // request id
    int pid; // process id
    int rrid; // release resource id
    int prid; // release process id
    int choice; //choice for options
    queue<int> p; // queue for processes
    //queue<int> r; // queue for resources
    //queue<int> w; //waiting queue
    //stack<int> q; // process in cs
    cout<<"*******MENU***********"<<'\n';
    cout<<"enter the no of process:"<<endl;
    cin>>n;
    //cout<<"enter the no of resources:"<<endl;
    //cin>>r;
    cout<<"enter the co-ordinator process:"<<endl;
    cin>>c;
    cout<<"enter the no of commands:"<<endl;
    cin>>m;
    bool cs = true;
    while(m--)
    {
        cout<<"choice menu:-"<<endl;
    cout<<"1.Request for Resource:"<<'\n';
    cout<<"2.Release the Resource:"<<'\n';
    cout<<"3.System Current Test:"<<'\n';
    cout<<"enter the choice:"<<endl;
    cin>>choice;
    bool nc = false;
    int allocated =  0;
    if(choice==1)
    {
        //request goes here
        cout<<"Process id:"<<endl;
        cin>>pid;
        if(cs==true)
        {
            cs = false;
            allocated =  pid;
            cout<<"Resource is Granted for-"<<pid<<'\n';
        }
        else
        {

            cout<<"Resource is Access is Denied-"<<pid<<'\n';
            nc = true;
            p.push(pid);
        }
    }   else if(choice==2)
    {
            //release goes here
            cout<<"Process id:"<<endl;
            cin>>prid;
            if(allocated==prid)
            {
                cs = true;
                cout<<"Critical Section is released by-"<<prid<<'\n';
                if(nc==true)
            {
                cout<<"Critical Section  is Available For-"<<p.front()<<'\n';
                nc=p.front();
                p.pop();

            }
            else
            {
            cout<<"the resource does not exit or it is queue for cs "<<prid<<'\n';
            }

    }


    }
    else if(choice==3)
    {
        cout<<"Status of System:"<<'\n';
        cout<<"Current Process in Critical Section:"<<nc<<'\n';
        cout<<"Process in Waiting Queue:-"<<'\n';
        while(!p.empty())
        {
        cout<<p.front();
        }
        cout<<endl;

       if(cs==true)
        {
            cout<<"Critical Section  is Available "<<'\n';
        }
        else
        {
            cout<<"Critical Section is bussy"<<'\n';
        }
    }
    }
}
