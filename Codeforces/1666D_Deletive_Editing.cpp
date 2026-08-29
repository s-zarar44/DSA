#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int n;
    cin >> n;
 
    for (int test = 1; test <= n; test++) {
        string s, t;
        cin >> s >> t;
 
        int freqS[26] = {0};
        int freqT[26] = {0};
 
        for (int i = 0; i < s.length(); i++) {
            freqS[s[i] - 'A']++;
        }
 
        for (int i = 0; i < t.length(); i++) {
            freqT[t[i] - 'A']++;
        }
 
        int i = 0;
 
        while (i < s.length()) {
            int ind = s[i] - 'A';
 
            if (freqS[ind] > freqT[ind]) {
                freqS[ind]--;
 
                s.erase(s.find(s[i]), 1);
            } else {
                i++;
            }
        }
 
        cout << (s == t ? "YES" : "NO") << '\n';
    }
 
    return 0;
}