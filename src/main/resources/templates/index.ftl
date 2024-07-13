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
            <!-- Visualisation content here -->
            <p>Time Elapsed: <span id="time-elapsed">0 ms</span></p>
        </div>
    </main>
    <aside class="options-panel">
        <h2>Options</h2>
        <div class="option-section">
            <h3>Normal Algorithms</h3>
            <label><input type="radio" name="algorithm" value="binary"> Binary Search</label>
            <label><input type="radio" name="algorithm" value="linear"> Linear Search</label>
            <label><input type="radio" name="algorithm" value="jump"> Jump Search</label>
            <label><input type="radio" name="algorithm" value="sentinel"> Sentinel Search</label>
            <label><input type="radio" name="algorithm" value="ternary"> Ternary Search</label>
            <label><input type="radio" name="algorithm" value="interpolation"> Interpolation Search</label>
            <label><input type="radio" name="algorithm" value="exponential"> Exponential Search</label>
            <label><input type="radio" name="algorithm" value="fibonacci"> Fibonacci Search</label>
            <label><input type="radio" name="algorithm" value="ubiquitous"> Ubiquitous Binary Search</label>
            <label><input type="radio" name="algorithm" value="meta-binary"> Meta Binary Search</label>

        </div>
        <div class="option-section">
            <h3>Graph Algorithms</h3>
            <label><input type="radio" name="algorithm" value="bfs"> Breadth-First Search (BFS)</label>
            <label><input type="radio" name="algorithm" value="dfs"> Depth-First Search (DFS)</label>
            <label><input type="radio" name="algorithm" value="uniform-cost"> Uniform Cost Search</label>
            <label><input type="radio" name="algorithm" value="a-star"> A* Algorithm</label>

        </div>
        <div class="option-section">
            <h3>Quantum Algorithms</h3>
            <label><input type="radio" name="algorithm" value="grover"> Grover's Algorithm</label>

        </div>
        <div class="option-section">
            <h3>Array Type</h3>
            <label><input type="radio" name="array" value="sorted"> Sorted</label>
            <label><input type="radio" name="array" value="unsorted"> Unsorted</label>
            <label><input type="radio" name="array" value="short"> Short</label>
            <label><input type="radio" name="array" value="long"> Long</label>
            <label><input type="radio" name="array" value="duplicates"> Duplicates</label>
            <label>
                <input type="radio" name="array" value="customArray"> Custom Array
                <input type="text" name="custom-array" placeholder="Enter an array, e.g: [1,3,4,5,3]" disabled>
            </label>
        </div>
        <div class="option-section">
            <h3>Search Number</h3>
            <label><input type="radio" name="search-input" value="randomNum"> Random Number</label>
            <label>
                <input type="radio" name="search-input" value="customNum"> Custom Number
                <input type="text" name="custom-number" placeholder="Enter a number, e.g: 4" disabled>
            </label>
        </div>
        <button class="reset-button">Reset Options</button>
    </aside>
</div>
<script defer src="/js/scripts.js"></script>
</body>
</html>
