document.addEventListener("DOMContentLoaded", function() {
    const optionsToggle = document.querySelector(".options-toggle");
    const optionsPanel = document.querySelector(".options-panel");

    optionsToggle.addEventListener("click", function() {
        optionsPanel.classList.toggle("open");
    });
const arrayRadios = document.getElementsByName("array");
    const customArrayInput = document.querySelector("input[name='custom-array']");

    const searchRadios = document.getElementsByName("search-input");
    const customNumberInput = document.querySelector("input[name='custom-number']");

    arrayRadios.forEach(radio => {
        radio.addEventListener("change", function () {
            if (this.value === "customArray") {
                customArrayInput.disabled = false;
            } else {
                customArrayInput.disabled = true;
                customArrayInput.value = ""; // Clear input when not selected
            }
        });
    });

    searchRadios.forEach(radio => {
        radio.addEventListener("change", function () {
            if (this.value === "customNum") {
                customNumberInput.disabled = false;
            } else {
                customNumberInput.disabled = true;
                customNumberInput.value = ""; // Clear input when not selected
            }
        });
    });
});
