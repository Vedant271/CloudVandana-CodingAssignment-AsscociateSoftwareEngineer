function addTask() {
    let taskInput = document.getElementById("task-input");
    let taskText = taskInput.value.trim();
    if (taskText === "") return;

    let taskItem = document.createElement("li");
    taskItem.classList.add("task");
    taskItem.innerHTML = `<i class="fas fa-check check-icon" style="display: none;"></i>
                            <span class="to-do"">${taskText}</span> 
                            <button class="remove-btn" onclick="removeTask(this)">Remove</button>`;
    
    taskItem.onclick = function() {
        toggleTask(taskItem);
    };

    document.getElementById("to-do-list").appendChild(taskItem);
    taskInput.value = "";
}

function removeTask(button) {
    button.parentElement.remove();
}

function toggleTask(taskItem) {
    let taskText = taskItem.querySelector(".to-do");
    let checkIcon = taskItem.querySelector(".check-icon");

    taskText.classList.toggle("completed");

    if (taskText.classList.contains("completed")) {
        checkIcon.style.display = "inline";
    } else {
        checkIcon.style.display = "none";
    }
}