#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        int a, b;
        cin >> a >> b;
 
        int xk, yk;
        cin >> xk >> yk;
 
        int xq, yq;
        cin >> xq >> yq;
 
        vector<pair<int, int>> moves = {
            {a, b}, {a, -b}, {-a, b}, {-a, -b},
            {b, a}, {b, -a}, {-b, a}, {-b, -a}
        };
 
        if (a == b) {
            moves = {
                {a, b}, {a, -b},
                {-a, b}, {-a, -b}
            };
        }
 
        int count = 0;
 
        for (auto [dx, dy] : moves) {
            int x = xk + dx;
            int y = yk + dy;
 
            if ((abs(x - xq) == a && abs(y - yq) == b) ||
                (abs(x - xq) == b && abs(y - yq) == a)) {
                count++;
            }
        }
 
        cout << count << '
';
    }
 
    return 0;
}