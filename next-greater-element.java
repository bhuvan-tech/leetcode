
stack<long long>s;
    s.push(arr[n-1]);
    arr[n-1]=-1;
    for(int i=n-2;i>=0;--i)
    {
        if (s.top()>arr[i]){
            long long temp=s.top();
            s.push(arr[i]);
            arr[i]=temp;
        }
        else{
            while(!s.empty()){
                if(s.top()>arr[i])
                {
                    long long temp=s.top();
                    s.push(arr[i]);
                    arr[i]=temp;
                    break;
                }
                s.pop();
            }
            if(s.empty()==true){
                s.push(arr[i]);
                arr[i]=-1;
            }
        }
    }
    return arr;
    }