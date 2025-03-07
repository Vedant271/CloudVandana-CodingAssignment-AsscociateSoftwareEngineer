function addTask() {
    let taskInput = document.getElementById("task-input");
    let taskText = taskInput.value.trim();
    if (taskText === "") return;

    let taskItem = document.createElement("li");
    taskItem.classList.add("task");
    taskItem.innerHTML = `<i class="fas fa-check check-icon" style="display: none;"></i>
    <span class="to-do" onclick="toggleTask(this)">${taskText}</span> 
                            <button class="remove-btn" onclick="removeTask(this)">Remove</button>`;
    
    document.getElementById("to-do-list").appendChild(taskItem);
    taskInput.value = "";
}

function removeTask(button) {
    button.parentElement.remove();
}

function toggleTask(taskElement) {
    let taskItem = taskElement.parentElement;
    let checkIcon = taskItem.querySelector(".check-icon");

    taskElement.classList.toggle("completed");

    if (taskElement.classList.contains("completed")) {
        checkIcon.style.display = "inline"; // Show check icon
    } else {
        checkIcon.style.display = "none"; // Hide check icon
    }
}