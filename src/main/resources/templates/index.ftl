<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Algorithm Visualiser</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<div class="container">
    <header>
        <button class="options-toggle">Options</button>
        <h1>Search Algorithm Visualiser</h1>
        <button class="visualise-button">Visualise</button>
    </header>
    <main>
        <div class="visual-panel">
            <!-- Visualisation content goes here -->
            <p>Time Elapsed: <span id="time-elapsed">0 ms</span></p>
        </div>
    </main>
    <aside class="options-panel">
        <h2>Options</h2>
        <div class="option-section">
            <h3>Normal Algorithms</h3>
            <label><input type="checkbox" name="algorithm" value="binary"> Binary Search</label>
            <label><input type="checkbox" name="algorithm" value="linear"> Linear Search</label>
            <label><input type="checkbox" name="algorithm" value="jump"> Jump Search</label>
            <label><input type="checkbox" name="algorithm" value="sentinel"> Sentinel Search</label>
            <label><input type="checkbox" name="algorithm" value="ternary"> Ternary Search</label>
        </div>
        <div class="option-section">
            <h3>Graph Algorithms</h3>
            <label><input type="checkbox" name="algorithm" value="bfs"> Breadth-First Search (BFS)</label>
            <label><input type="checkbox" name="algorithm" value="dfs"> Depth-First Search (DFS)</label>
            <label><input type="checkbox" name="algorithm" value="dijkstra"> Dijkstra's Algorithm</label>
            <label><input type="checkbox" name="algorithm" value="bellman-ford"> Bellman-Ford Algorithm</label>
            <label><input type="checkbox" name="algorithm" value="kruskal"> Kruskal's Algorithm</label>
            <label><input type="checkbox" name="algorithm" value="prim"> Prim's Algorithm</label>
            <label><input type="checkbox" name="algorithm" value="floyd-warshall"> Floyd-Warshall Algorithm</label>
        </div>
        <div class="option-section">
            <h3>Quantum Algorithms</h3>
            <!-- Add quantum algorithms here -->
        </div>
        <div class="option-section">
            <h3>Array Type</h3>
            <label><input type="checkbox" name="array" value="sorted"> Sorted</label>
            <label><input type="checkbox" name="array" value="unsorted"> Unsorted</label>
            <label><input type="checkbox" name="array" value="short"> Short</label>
            <label><input type="checkbox" name="array" value="long"> Long</label>
            <label><input type="checkbox" name="array" value="duplicates"> Duplicates</label>
            <label><input type="checkbox" name="array" value="custom"> Custom Input</label>
        </div>
        <div class="option-section">
            <h3>Search Input</h3>
            <label><input type="radio" name="search-input" value="manual"> Manual Input</label>
            <label><input type="radio" name="search-input" value="random"> Random Number</label>
        </div>
        <button class="reset-button">Reset Options</button>
    </aside>
</div>
<script defer src="/js/scripts.js"></script>
</body>
</html>
