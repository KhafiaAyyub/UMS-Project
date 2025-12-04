-- Insert Departments
INSERT INTO department (id, name) VALUES 
(1, 'Computer Science'),
(2, 'Electronics'),
(3, 'Mechanical');

-- Insert Students for Department 1 (CS)
INSERT INTO student (id, name, age, department_id) VALUES
(1, 'Amit Sharma', 21, 1),
(2, 'Pooja Singh', 22, 1),
(3, 'Rohan Verma', 20, 1);

-- Insert Students for Department 2 (EC)
INSERT INTO student (id, name, age, department_id) VALUES
(4, 'Sana Khan', 23, 2),
(5, 'Arjun Mehta', 21, 2);

-- Insert Students for Department 3 (MECH)
INSERT INTO student (id, name, age, department_id) VALUES
(6, 'Deepak Rao', 22, 3);
