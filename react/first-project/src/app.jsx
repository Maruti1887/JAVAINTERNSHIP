import { useState } from "react";

function App() {
  const [isOn, setIsOn] = useState(false);

  return (
    <div style={styles.container}>
      <h1 style={styles.title}>💡 Smart Light</h1>

      {/* Bulb */}
      <div
        style={{
          ...styles.bulb,
          backgroundColor: isOn ? "#FFD700" : "#555",
          boxShadow: isOn
            ? "0 0 60px #FFD700, 0 0 120px #FFA500"
            : "none",
        }}
      ></div>

      {/* Wire */}
      <div style={styles.wire}></div>

      {/* Buttons */}
      <div style={styles.buttonContainer}>
        <button
          style={{ ...styles.button, backgroundColor: "#28a745" }}
          onClick={() => setIsOn(true)}
        >
          ON
        </button>

        <button
          style={{ ...styles.button, backgroundColor: "#dc3545" }}
          onClick={() => setIsOn(false)}
        >
          OFF
        </button>
      </div>
    </div>
  );
}

const styles = {
  container: {
    height: "100vh",
    background: "linear-gradient(to bottom, #0f2027, #203a43, #2c5364)",
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
    color: "white",
    fontFamily: "Arial",
  },
  title: {
    marginBottom: "40px",
    fontSize: "32px",
    letterSpacing: "2px",
  },
  bulb: {
    width: "150px",
    height: "150px",
    borderRadius: "50%",
    transition: "all 0.4s ease",
  },
  wire: {
    width: "4px",
    height: "100px",
    backgroundColor: "#999",
  },
  buttonContainer: {
    marginTop: "40px",
  },
  button: {
    padding: "12px 25px",
    margin: "0 10px",
    border: "none",
    borderRadius: "25px",
    color: "white",
    fontSize: "16px",
    cursor: "pointer",
    transition: "0.3s",
  },
};

export default App;