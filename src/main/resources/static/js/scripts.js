document.addEventListener("DOMContentLoaded", function() {
    const optionsToggle = document.querySelector(".options-toggle");
    const optionsPanel = document.querySelector(".options-panel");

    optionsToggle.addEventListener("click", function() {
        optionsPanel.classList.toggle("open");
    });
});
