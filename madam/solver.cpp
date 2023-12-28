#include<bits/stdc++.h>

bool isPalindrome(std::string str)
{
    int l = 0, r = str.length() - 1;

    while(l < r)
    {
        if(str[l] != str[r])
        {
            return false;
        }
        l++;
        r--;
    }

    return true;
}

int main()
{
    freopen("password.txt", "r", stdin);
    std::string str = "";
    std::cout << "Start" << "\n";
    int maxLengh = 0;
    std::string res;
    while(getline(std::cin, str))
    {
        int len = str.length();
        for(int i = 0; i < len; i++)
        {
            for(int j = 1; j <= len-i; j++)
            {
                if(isPalindrome(str.substr(i, j)))
                {
                    if(str.substr(i, j).length() > maxLengh)
                    {
                        maxLengh = str.substr(i, j).length();
                        res = str.substr(i, j);
                    }
                    std::cout << "Palindrome: " << str.substr(i, j) << "\n";
                }
            }
        }
    }
    std::cout << "Res: " << res << "\n";
}