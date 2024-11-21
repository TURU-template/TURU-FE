// =========STOPWATCH FUNCTION - SLEEP COUNTER=========
let isRunning = false;
let startTime, endTime;

const stopwatchBtn = document.getElementById('stopwatchBtn');
const resultDisplay = document.getElementById('resultDisplay');
const timestampDisplay = document.getElementById('timestampDisplay');

// Stopwatch functionality
stopwatchBtn.addEventListener('click', () => {
    if (!isRunning) {
        // START timestamp
        startTime = new Date();
        timestampDisplay.innerHTML = `<span>Waktu Tidur: ${startTime.toLocaleTimeString()}</span>`; // Menggunakan innerHTML agar dapat menambahkan tag <span>
        stopwatchBtn.textContent = "STOP";
    } else {
        // STOP timestamp
        endTime = new Date();
        const elapsedTime = (endTime - startTime) / 1000; // Convert to seconds
        const hours = Math.floor(elapsedTime / 3600);
        const seconds = Math.floor(elapsedTime % 3600);
        resultDisplay.textContent = `${hours} j ${seconds} m`;

        // Menambahkan "Waktu Bangun" di bawah "Waktu Tidur"
        timestampDisplay.innerHTML += `<span>Waktu Bangun: ${endTime.toLocaleTimeString()}</span>`;
        stopwatchBtn.textContent = "START";
    }
    isRunning = !isRunning;
});
