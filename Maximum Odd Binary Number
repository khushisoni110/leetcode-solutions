class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int zeroes = 0, ones = 0;
        for(int i = 0; i < s.length(); i++){
            if(s[i] == '0'){
                zeroes++;
            }
            else {
                ones++;
            }
        }
        
        string result = "";
        for(int i = 0; i < ones - 1; i++){
            result.append("1");
        }

        for(int i = 0; i < zeroes; i++){
            result.append("0");
        }
        
        result.append("1");

        return result;
    }
};
