import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  test: {
    globals: true,            // <-- Das aktiviert `test`, `expect` etc. ohne Import
    environment: 'jsdom',     // <-- Für DOM-Tests nötig
    setupFiles: './src/setupTests.js' // Optional, falls du `jest-dom` nutzt
  }
})
