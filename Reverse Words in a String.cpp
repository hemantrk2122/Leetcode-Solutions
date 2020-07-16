//In this I am using stringstream which allows me to process the string as a collection of word(also a string)

// Here i'm iterrating over all words of my input string and saving that into the string word (using >> operator which indicates the data flow ).
class Solution {
public:
    string reverseWords(string s) {
        stringstream x(s);
        string word,ans="";
        while(x>>word){
            ans=word+" "+ans;
            
        }
        
        return ans.substr(0,ans.length()-1);
        
    }
};  
