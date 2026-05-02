
#include <bits/stdc++.h>
using namespace std;

string s;
bool vis[7][7];
int ans = 0;

int dx[4] = {-1, 1, 0, 0};   // U, D, L, R
int dy[4] = {0, 0, -1, 1};
char dc[4] = {'U', 'D', 'L', 'R'};

inline bool inside(int x, int y) {
    return x >= 0 && x < 7 && y >= 0 && y < 7;
}

void dfs(int x, int y, int i) {

    // reached destination
    if (x == 6 && y == 0) {
        if (i == 48) ans++;
        return;
    }
    if (i == 48) return;

    vis[x][y] = true;

    // 🔥 editorial split pruning
    // vertical blocked, horizontal open
    if ((x == 0 || vis[x-1][y]) && (x == 6 || vis[x+1][y]) &&
        y > 0 && !vis[x][y-1] && y < 6 && !vis[x][y+1]) {
        vis[x][y] = false;
        return;
    }

    // horizontal blocked, vertical open
    if ((y == 0 || vis[x][y-1]) && (y == 6 || vis[x][y+1]) &&
        x > 0 && !vis[x-1][y] && x < 6 && !vis[x+1][y]) {
        vis[x][y] = false;
        return;
    }

    char c = s[i];

    for (int d = 0; d < 4; d++) {
        if (c == '?' || c == dc[d]) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (inside(nx, ny) && !vis[nx][ny]) {
                dfs(nx, ny, i + 1);
            }
        }
    }

    vis[x][y] = false;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> s;   // length = 48
    dfs(0, 0, 0);
    cout << ans << '\n';
}
