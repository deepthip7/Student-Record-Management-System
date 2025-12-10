let students = [];

function addStudent() {
    let roll = parseInt(document.getElementById("roll").value);
    let name = document.getElementById("name").value;
    let marks = parseInt(document.getElementById("marks").value);
    let club = document.getElementById("club").value;

    if (students.find(s => s.roll === roll)) {
        alert("Student with this roll already exists!");
        return;
    }

    students.push({ roll, name, marks, club });
    alert("Student added!");
    showStudents();
}

function editStudent() {
    let roll = parseInt(document.getElementById("roll").value);
    let student = students.find(s => s.roll === roll);

    if (student) {
        student.name = document.getElementById("name").value;
        student.marks = parseInt(document.getElementById("marks").value);
        student.club = document.getElementById("club").value;
        alert("Student updated!");
        showStudents();
    } else {
        alert("Student not found!");
    }
}

function deleteStudent() {
    let roll = parseInt(document.getElementById("roll").value);
    students = students.filter(s => s.roll !== roll);
    alert("Student deleted!");
    showStudents();
}

function searchStudent() {
    let roll = parseInt(document.getElementById("searchRoll").value);
    let student = students.find(s => s.roll === roll);

    if (student) {
        alert(`Roll: ${student.roll}, Name: ${student.name}, Marks: ${student.marks}, Club: ${student.club}`);
    } else {
        alert("Student not found!");
    }
}

function showStudents() {
    let output = document.getElementById("output");

    if (students.length === 0) {
        output.innerHTML = "<h3>No Students Added Yet</h3>";
        return;
    }

    output.innerHTML = "<h3>All Students</h3>" + students.map(s =>
        `Roll: ${s.roll}, Name: ${s.name}, Marks: ${s.marks}, Club: ${s.club}`
    ).join("<br>");
}
